using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SE1311_Project_Group5.DTL
{
    class Customer
    {
        private int customerNumber;
        public int CustomerNumber
        {
            get { return customerNumber; }
            set { customerNumber = value; }
        }


        private string name;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }
        private char gender;

        public char Gender
        {
            get { return gender; }
            set { gender = value; }
        }
        private string address;

        public string Address
        {
            get { return address; }
            set { address = value; }
        }
        private string telephone;

        public string Telephone
        {
            get { return telephone; }
            set { telephone = value; }
        }
        private string email;
        

        public string Email
        {
            get { return email; }
            set { email = value; }
        }

        public string BorrowerDate { get; internal set; }

        public Customer(int customerNumber, string name, char gender, string address, string telephone, string email)
        {
            this.customerNumber = customerNumber;
            this.name = name;
            this.gender = gender;
            this.telephone = telephone;
            this.address = address;
            this.email = email;

        }

        public Customer()
        {
        }

        public override string ToString()
        {
            return (customerNumber.ToString() + '\t' + name + '\t' + gender + '\t' + address + '\t' + telephone + '\t' + email);
        }

    }
}

