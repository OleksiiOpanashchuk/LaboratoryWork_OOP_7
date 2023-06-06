# Laboratory Work 7

# Discription

This project includes the following tasks: <br>
Task 1.
We are going to create a taxi service. So for the beginning our service needs cars. Create a car class with fields: Car brand, engine power, driver, price, year of manufacture.
Create a driver class with fields: name, age, driving experience. 
!!!!! You need to choose the data types for each field yourself. Classes must have all the necessary set of methods, including constructors.
Create at least 10 and no more than 20 cars. When creating objects, use constructors with parameters. Put all our created cars into an ArrayList.
Repair the engine of half of the fleet, which will increase the power of the cars by 10% (reassignment of the power field). Hire new drivers for the repaired cars (reassign the driver field).
Next, you need to take every second car (use a loop with a step of 2 and the size() method), and increase the engine power by 10% and the price by 5%.
After that, check the experience of ALL our drivers. If the driver's experience is less than 5 years, but his age is more than 25, then you need to send him to a refresher course, which will increase his experience by 1 year.
You need to create a helper class where you write a method that takes an array of cars as a parameter and selects a random element from this array ( new Random().nextInt(cars.length); cars is the name of the array of cars (substitute your own)).
After the element is found, you need to print to the console the text in the style "A car of brand *model* with driver *name* followed you". Then pass this car to the following method, which will display in the console "Driver *name* arrived at the place"

Task 2.
Write a Phonebook program that stores names and phone numbers using the HashMap class.
Try the following operations with Map: 
1. put (K key, V value) - adds an element to the map;
2. get (Object key) - searches for a value by its key;
3. remove (Object key) - deletes the value by its key;
4.  containsKey (Object key) - asks if the specified key is in the map;
5.  containsValue (Object value) - asks if the map contains the specified value;
6. size () - returns the size of the map (the number of key-value pairs).
To do this, add at least 10 names and phone numbers to the book.
Print the information from the book using a loop. 
Find the given number in the book by name. If the last name is missing, the message "There is no such subscriber in the book" should be displayed. Delete any entry from the directory. Print the number of entries in the directory.

# Requirements.
To run this project, you must have the following installed on your computer: IntelliJ IDEA Community Edition.

# Build Instructions
Clone the repository to your local machine using <br>
git clone https://github.com/OleksiiOpanashchuk/LaboratoryWork_OOP_7

# Results

Task1 (TaxiService): <br>

![1](https://github.com/OleksiiOpanashchuk/LaboratoryWork_OOP_7/assets/132139593/6069eb8e-71a7-4e68-8f44-9241422602e5)

Task2 (PhoneBook): <br>

![2](https://github.com/OleksiiOpanashchuk/LaboratoryWork_OOP_7/assets/132139593/a30a8d68-e4e6-4f6c-abd2-47a55ec65b80)



