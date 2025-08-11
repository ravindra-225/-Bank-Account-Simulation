# Bank-Account-Simulation  
## 📌 Overview  
- This is a Java-based Bank Account Simulation that demonstrates Object-Oriented Programming - (OOP) principles.  
- It provides account management features such as deposits, withdrawals, balance checking, and transaction history tracking.  
- The application uses a text-based console menu for user interaction.  

## 🛠 Prerequisites  
Before running the project, make sure you have:  
-  Java Development Kit (JDK): Version 8 or higher  
- Spring Tool Suite (STS) (or any Java IDE)  
- Git: For version control  

## 📂 Project Structure  
BankAccountSimulation/  
│  
├── src/com/example/banking/   
│   ├── Account.java    # Banking logic  
│   ├── Main.java       # User interface and main execution  
│  
├── .gitignore          # Ignore build and IDE files  
├── README.md           # Project documentation  
└── screenshots/        # (Optional) Output screenshots  
## 🚀 Setup Instructions   
Create the Project in STS  
Open STS → File > New > Java Project  
Name it BankAccountSimulation  
Ensure JRE is set to JDK 8 or higher  
Create a package: com.example.banking  
Add Account.java and Main.java inside the package  

## ▶ How to Run
Using STS  
Right-click Main.java → Run As > Java Application  

Using Terminal  
javac -d . src/com/example/banking/*.java  
java com.example.banking.Main  
##  Features
  ## 🏦 Account Management  
  - Create an account with account number and initial balance  
  - Deposit funds (validates positive amount)  
  - Withdraw funds (validates sufficient balance)  
  - Check current balance  
  - View transaction history with timestamps

  ## ⚠ Error Handling
  - Validates numeric inputs  
  - Prevents negative deposits/withdrawals  
  - Blocks withdrawals exceeding balance  

  ## 📅 Transaction History  
  Stores each transaction with:  
  - Type (Deposit / Withdrawal / Initial Deposit)  
  - Amount  
  - Balance after transaction  
  - Timestamp

## 💻 Example Usage   
Enter account number: ACC123  
Enter initial balance: 1000  

=== Bank Account Simulation ===
1. Deposit
2. Withdraw
3. Check Balance
4. View Transaction History
5. Exit

Enter your choice: 1  
Enter deposit amount: 500  
Deposited $500.00. New balance: $1500.00

Enter your choice: 4  
=== Transaction History ===   
[2025-08-11 16:18:00] Initial Deposit: $1000.00, Balance: $1000.00  
[2025-08-11 16:18:05] Deposit: $500.00, Balance: $1500.00  

## 📷 Screenshots (Optional)  
<img width="885" height="798" alt="Screenshot 2025-08-11 180226" src="https://github.com/user-attachments/assets/1aec1b8f-f278-4d1a-af37-9a9cee409f12" />
<img width="991" height="755" alt="Screenshot 2025-08-11 180259" src="https://github.com/user-attachments/assets/3d8affdc-2fb1-48aa-81e4-667994e7eb49" />
<img width="973" height="395" alt="Screenshot 2025-08-11 180323" src="https://github.com/user-attachments/assets/eed18aae-e8a9-4d2d-b7e2-1758f30d10e4" />

## 📤 GitHub Setup & Push 
- git init
- git add .
- git commit -m "Initial commit for Bank Account Simulation"
- git branch -M main
- git remote add origin https://github.com/<your-username>/BankAccountSimulation.git
- git push -u origin main
## 📝 Notes
- Uses only standard Java libraries (java.util.ArrayList, java.time)
- Transaction history is stored in memory — resets when the program ends
- For persistent history, you could extend this with file-based storage

