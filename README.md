
# Mortgage Calculator (Java)

A beginner-friendly Java CLI application that calculates mortgage payments and optionally displays a full payment schedule.

## 🚀 Features

- Validates user input (principal, interest rate, period)
- Calculates monthly payments using amortization formula
- Offers to display a monthly balance schedule
- Uses modular, well-structured methods
- Friendly user prompts and clean output

## 📁 Folder Structure
  mortgage-calculator/
  ├── src/
  │ └── Main.java
  ├── .gitignore
  ├── README.md
  └── LICENSE (optional)


## 🧪 Sample Output
``` bash
Please enter your name: User
Hello User
Enter your principal: 15000
Enter your pay period (in years): 4
Please enter your annual interest rate (in percentages): 5.5
Annual Interest: 5.5%
MORTGAGE
--------
Your monthly payment is: $348.85
Do you want to see your payment schedule?(y/n) 
yeah
PAYMENT SCHEDULE
---------------
Month 1: $14,719.90
Month 2: $14,438.52
Month 3: $14,155.85
Month 4: $13,871.89
....
Month 47: $347.26
Month 48: $0.00
```

## 🛠️ How to Run

```bash
javac src/Main.java
java -cp src Main
```

## 📥 Download

Download the compiled `.jar` from the [latest release](https://github.com/yourusername/mortgage_calculator_final/releases).

