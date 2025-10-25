# FileHider System

## Overview
FileHider System is a **Java OOP and MySQL-based application** that allows users to:
- Hide files
- Unhide files
- View hidden files

It also implements **email-based OTP verification** for user login and signup.

---

## Features
1. User registration with OTP verification.
2. Login with OTP verification.
3. Hide new files.
4. Unhide files.
5. View all hidden files with unique IDs.

---

## Technologies Used
- Java 17
- MySQL 8
- JavaMail API for sending OTP
- OOP concepts (Classes, Methods, Packages)
- Dotenv library for environment variables

---
------------------------------------------------------------------------------------------
CONSIDER THE EXAMPLE
------------------------------------------------------------------------------------------
Usage

Run Main.java.

You will see a welcome screen:

Welcome to the FileHider   
------------------------------
Press 1 to login
Press 2 to signup
Press 0 to exit
------------------------------


Follow the prompts to login, signup, hide/unhide files, or view hidden files.

Example Output
1. Login and OTP Verification
Press the key -> 1
Enter Email:
harsh@gmail.com
Enter the Name:
harsh
✅ MYSQL Connection is Successful..
Sending OTP...
Sent message successfully....
Enter the OTP
6190
--------Welcome harsh-----------

2. Show Hidden Files
---------------------------------------
Press 1 to show hidden files
Press 2 to hide a new file
Press 3 to unhide a file
Press 0 to exit
---------------------------------------
Press the key -> 1
-------------------------------------
This are File/Files with this ID & names:
4 - timepass.txt
5 - timepass2.txt

3. Hide a New File
Press the key -> 2
Enter the file path:
C:\Users\Harshad shinde\OneDrive\Desktop\timepass3.txt
File is hidden successfully :)

4. Unhide a File
Press the key -> 3
ID - File Name
------------------------------
4 - timepass.txt
5 - timepass2.txt
6 - timepass3.txt
Enter the ID of file to UNHIDE it
4
File is Successfully Unhidden

5. Exit
Press the key -> 0
Process finished with exit code 0
