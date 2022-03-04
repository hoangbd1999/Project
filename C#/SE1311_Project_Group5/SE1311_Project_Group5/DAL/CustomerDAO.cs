using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;
using SE1311_Project_Group5.DTL;

namespace SE1311_Project_Group5.DAL
{
    class CustomerDAO
    {
        public static DataTable GetDataTable()
        {
            string cmd = "SELECT * FROM[dbo].[Customer]";
            return DAO.GetDataTable(cmd);
        }

        public static bool Insert(Customer b)
        {
            SqlCommand cmd = new SqlCommand("insert INTO [dbo].[Customer] (customerNumber, name, gender, address, telephone, email)" +
                    "values (@customerNumber, @name, @gender, @address, @telephone, @email)");
            cmd.Parameters.AddWithValue("@customerNumber", b.CustomerNumber);
            cmd.Parameters.AddWithValue("@name", b.Name);
            cmd.Parameters.AddWithValue("@gender", b.Gender);
            cmd.Parameters.AddWithValue("@address", b.Address);
            cmd.Parameters.AddWithValue("@telephone", b.Telephone);
            cmd.Parameters.AddWithValue("@email", b.Email);
            return DAO.UpdateTable(cmd);
        }

        public static bool Update(Customer b)
        {
            SqlCommand cmd = new SqlCommand("update [dbo].[Customer] set name=@name, gender = @gender, address = @address, telephone = @telephone, email = @email where customerNumber=@customerNumber");
            cmd.Parameters.AddWithValue("@customerNumber", b.CustomerNumber);
            cmd.Parameters.AddWithValue("@name", b.Name);
            cmd.Parameters.AddWithValue("@gender", b.Gender);
            cmd.Parameters.AddWithValue("@address", b.Address);
            cmd.Parameters.AddWithValue("@telephone", b.Telephone);
            cmd.Parameters.AddWithValue("@email", b.Email);
            return DAO.UpdateTable(cmd);
        }

        public static int GetIdMax()
        {
            DataTable dt = GetDataTable();
            if (dt.Rows.Count == 0) return 0;
            else return (int)(dt.Compute("max(customerNumber)", ""));
        }

        public static Boolean Delete(int customerNumber)
        {
            SqlCommand cmd = new SqlCommand("delete [dbo].[Customer] where customerNumber=@customerNumber");
            cmd.Parameters.AddWithValue("@customerNumber", customerNumber);
            return DAO.UpdateTable(cmd);
        }

        public static Customer GetCustomer(int customerNumber)
        {
            SqlConnection conn = DAO.getConnections();
            string sql = "SELECT * FROM Customer WHERE customerNumber = @customerNumber";
            SqlCommand command = new SqlCommand(sql, conn);
            command.Parameters.Add(new SqlParameter("@customerNumber", customerNumber));
            conn.Open();
            SqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                Customer s = new Customer();
                s.CustomerNumber = int.Parse(reader["customerNumber"].ToString());
                s.Name = reader["name"].ToString();
                s.Gender = char.Parse(reader["gender"].ToString());
                s.Address = reader["address"].ToString();
                s.Telephone = reader["telephone"].ToString();
                s.Email = reader["email"].ToString();
                conn.Close();
                return s;
            }
            return null;
        }
    }
}
