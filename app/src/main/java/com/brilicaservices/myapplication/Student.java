package com.brilicaservices.myapplication;


    public class Student {


        String studentName;
        String studentCollege;
        long studentPhoneNumber;
        String studentAddress;

    /*
    * Creating a constructor in which we will pass the respective data i.e.
    * studentName, studentCollege, studentPhoneNumber, studentAddress*/

        public Student(String studentName, String studentCollege, long studentPhoneNumber, String studentAddress) {
            this.studentName = studentName;
            this.studentCollege = studentCollege;
            this.studentPhoneNumber = studentPhoneNumber;
            this.studentAddress = studentAddress;
        }

    /*
    * Creating a getter setter method.*/

        public long getStudentPhoneNumber() {
            return studentPhoneNumber;
        }

        public String getStudentAddress() {
            return studentAddress;
        }

        public String getStudentCollege() {
            return studentCollege;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentAddress(String studentAddress) {
            this.studentAddress = studentAddress;
        }

        public void setStudentCollege(String studentCollege) {
            this.studentCollege = studentCollege;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setStudentPhoneNumber(long studentPhoneNumber) {
            this.studentPhoneNumber = studentPhoneNumber;
        }

    }

