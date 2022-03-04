using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using SE1311_Project_Group5.DAL;
using SE1311_Project_Group5.DTL;

namespace SE1311_Project_Group5.GUI
{
    public partial class CustomerGUI : Form
    {
        DataView dv;
        Customer b;
        public CustomerGUI()
        {
            InitializeComponent();
            view();
            displayButtons(1);
        }
        private void view()
        {
            DataTable dt = CustomerDAO.GetDataTable();
            dv = new DataView(dt);
            dataGridView1.DataSource = dv;
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            int num = e.RowIndex;
            customerNumbertxt.Text = dataGridView1.Rows[num].Cells["customerNumber"].Value.ToString();
            nametxt.Text = dataGridView1.Rows[num].Cells["name"].Value.ToString();
            gendertxt.Text = dataGridView1.Rows[num].Cells["gender"].Value.ToString();
            addresstxt.Text = dataGridView1.Rows[num].Cells["address"].Value.ToString();
            telephonetxt.Text = dataGridView1.Rows[num].Cells["telephone"].Value.ToString();
            emailtxt.Text = dataGridView1.Rows[num].Cells["email"].Value.ToString();
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            if (!isSelected()) return;

            int customerNumber = (int)dataGridView1.SelectedRows[0].Cells["customerNumber"].Value;
            DialogResult dr = MessageBox.Show(String.Format("Do you want to delete this customer number {0}?", customerNumber), "Confirm deteting", MessageBoxButtons.YesNo);
            if (dr == DialogResult.No) return;

            CustomerDAO.Delete(customerNumber);
            view();
        }

        private bool isSelected()
        {
            if (dataGridView1.SelectedRows.Count == 0)
            {
                MessageBox.Show("You must select a room in the list of customers!");
                return false;
            }
            if (dataGridView1.SelectedRows[0].Cells["customerNumber"].Value == null)
            {
                MessageBox.Show("You must select a room in the list of customers!");
                return false;
            }
            return true;
        }

        private void displayButtons(int state)
        {
            switch (state)
            {
                // allow to filter/Add/Edit/Delete book
                case 1:
                    customerNumbertxt.Enabled = true;
                    customerNumbertxt.Focus();

                    nametxt.Enabled = false;
                    gendertxt.Enabled = false;
                    addresstxt.Enabled = false;
                    telephonetxt.Enabled = false;
                    emailtxt.Enabled = false;


                    btnFilter.Enabled = true;

                    btnAdd.Text = "Add";
                    btnAdd.Enabled = true;

                    btnEdit.Text = "Edit";
                    btnEdit.Enabled = true;

                    btnDelete.Enabled = true;
                    break;

                // Allow to add a book
                case 2:
                    customerNumbertxt.Enabled = false;
                    nametxt.Enabled = true;
                    gendertxt.Enabled = true;
                    addresstxt.Enabled = true;
                    telephonetxt.Enabled = true;
                    emailtxt.Enabled = true;
                    nametxt.Focus();

                    btnAdd.Text = "Save";
                    btnAdd.Enabled = true;

                    btnFilter.Enabled = false;
                    btnEdit.Enabled = false;
                    btnDelete.Enabled = false;

                    break;

                // Allow to edit a book
                case 3:

                    customerNumbertxt.Enabled = false;
                    nametxt.Enabled = true;
                    gendertxt.Enabled = true;
                    addresstxt.Enabled = true;
                    telephonetxt.Enabled = true;
                    emailtxt.Enabled = true;
                    nametxt.Focus();

                    btnEdit.Text = "Save";
                    btnEdit.Enabled = true;

                    btnFilter.Enabled = false;
                    btnAdd.Enabled = false;
                    btnDelete.Enabled = false;
                    break;

            }
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            if (btn.Text == "Add")
            {
                displayButtons(2);
            }
            else
            {
                char gender = new char();
                if (gendertxt.Text != "")
                {
                    gender = gendertxt.Text[0];
                }
                b = new Customer(CustomerDAO.GetIdMax() + 1, nametxt.Text, gender, addresstxt.Text, telephonetxt.Text, emailtxt.Text);

                CustomerDAO.Insert(b);

                view();

                displayButtons(1);
            }
        }

        private void btnEdit_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;
            if (btn.Text == "Edit")
            {
                if (!isSelected()) return;

                displayButtons(3);

            }
            else
            {
                char gender = new char();
                if (gendertxt.Text != "")
                {
                    gender = gendertxt.Text[0];
                }
              
                int customerNumber = (int)dataGridView1.SelectedRows[0].Cells["customerNumber"].Value;
                b = new Customer(customerNumber, nametxt.Text, gender, addresstxt.Text, telephonetxt.Text, emailtxt.Text);
                CustomerDAO.Update(b);

                view();

                displayButtons(1);
            }
        }

        private void btnFilter_Click(object sender, EventArgs e)
        {
            int customerNumber;
            try
            {
                customerNumber = int.Parse(customerNumbertxt.Text);
            }
            catch
            {
                MessageBox.Show("Customer number must be integer (empty for all customers)!");
                if (customerNumbertxt.Text != "") return;
                else customerNumber = -1;
            }

            if (customerNumber > -1) dv.RowFilter = "customerNumber = " + customerNumber.ToString();
        }

        private void gendertxt_Validating(object sender, CancelEventArgs e)
        {
            if (gendertxt.Text.Length == 0)
            {
                // Cancel the event and select the text to be corrected by the user.
                e.Cancel = true;
                gendertxt.Select(0, gendertxt.Text.Length);

                // Set the ErrorProvider error with the text to display.  
                this.errorProvider.SetError(gendertxt, "Must be 'M' or 'F'");
                return;
            }
            if (gendertxt.Text[0] != 'M' && gendertxt.Text[0] != 'F')
            {
                // Cancel the event and select the text to be corrected by the user.
                e.Cancel = true;
                gendertxt.Select(0, gendertxt.Text.Length);

                // Set the ErrorProvider error with the text to display.  
                this.errorProvider.SetError(gendertxt, "Must be 'M' or 'F'");
                return;
            }
            e.Cancel = false;
        }

        private void gendertxt_Validated(object sender, EventArgs e)
        {
            errorProvider.SetError(gendertxt, "");
        }

        private void nametxt_Validating(object sender, CancelEventArgs e)
        {
            if (string.IsNullOrEmpty(nametxt.Text))
            {
                e.Cancel = true;
                nametxt.Focus();
                errorProvider.SetError(nametxt, "Please enter name!");
            }
            else
            {
                e.Cancel = false;
                errorProvider.SetError(nametxt, null);
            }
        }
    }
}
