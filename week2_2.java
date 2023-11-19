//  2. Create a function to compute the XOR of two codewords.

import java.util.Scanner;
public class week2_2 
{
    public static void main(String[] ar)
    {
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter codewords : ");
        xor(i1.next(),i1.next());
        i1.close();
    }
    static void xor(String a,String b)
    {
        if(a.length()!=b.length())
            System.out.println("-1");
        else
            for(int i=0;i<a.length();i++)
                System.out.print(a.charAt(i)^b.charAt(i));
    }
}



// create database sem5;
// use sem5;
// create table employee
// (Empno integer,Ename varchar(20),Job varchar(20),Mgr integer,Sal integer,Commission integer);
// show tables;
// insert into employee
// values(1,'Sam','Teacher',123,10000,100);
// insert into employee
// values
// (3,'Sam','Teacher',123,10000,100),
// (2,'Sam','Teacher',123,10000,100);
// select * from employee;
// rollback;
// select * from employee;
// delete from employee;
// describe employee;
// alter table employee
// modify column Empno int primary key not null;
// describe employee;
// delete from employee;
// delete from employee where Empno = 3;
// select * from employee;


// CREATE DATABASE lab;
// USE lab;
// CREATE TABLE employee(Empno INT,Ename VARCHAR(30),Job VARCHAR(30),Mgr INT,Sal INT,Commission INT);
// INSERT INTO employee (Empno, Ename, Job, Mgr, Sal, Commission)
// VALUES (1,"Jai","TL",3000,3200,2200),
// (2,"Ram","Designer",2000,3900,1200),
// (3,"Priya","HR",2100,3500,1220);
// ROLLBACK;
// SELECT * FROM employee;
// delete from employee;

// ALTER TABLE employee ADD PRIMARY KEY(Empno);
// ALTER TABLE employee MODIFY Empno INT NOT NULL,
// MODIFY Job VARCHAR(30) NOT NULL,
// MODIFY Mgr INT NOT NULL,
// MODIFY Sal INT NOT NULL,
// MODIFY Commission INT NOT NULL;