# DepartmentInformation_CompositeDesignPattern

This project demonstrates the **Composite Design Pattern** by modeling an organizational structure that consists of individual employees and departments. The pattern allows us to treat individual employees and entire departments uniformly when calculating total salary expenses.

## Project Structure

The project includes the following components:

1. **OrganizationUnit (Interface)**
   - Defines a common method for all components in the structure:
     - `calculateTotalPrice()`: Calculates the total cost associated with the organizational unit, whether it’s an individual employee or a department.

2. **Employee (Leaf Class)**
   - Represents individual employees within the organization.
   - Implements `OrganizationUnit` to calculate and return an employee’s salary.
   - Has attributes `id`, `name`, and `salary`.

3. **Department (Composite Class)**
   - Represents a department containing a list of organizational units (both individual employees and sub-departments).
   - Contains methods to:
     - `addOrganizationUnit()`: Add employees or other departments to this department.
     - `calculateTotalPrice()`: Calculate the total salary cost by summing up salaries of all employees and sub-departments within it.

4. **Main (Driver Class)**
   - Demonstrates the Composite Pattern by creating instances of `Employee` and `Department` and calculating the total salary expense for each department.

## How It Works

1. **Composite Design Pattern**:
   - The Composite Pattern allows us to create a tree-like structure where each `Department` can contain both `Employee` instances and other `Department` instances.
   - This hierarchy enables treating individual employees and entire departments uniformly when performing operations like calculating total salaries.

2. **Salary Calculation**:
   - Each `Employee` directly returns their salary.
   - Each `Department` iterates over its list of `OrganizationUnit` components, recursively summing the salaries from individual employees and sub-departments.

## Sample Output

Running the `Main` class produces output similar to:

```plaintext
Organization Unit Added!!
Organization Unit Added!!
55300.0
-------------------------------------
Organization Unit Added!!
311300.0
```


## Key Takeaways
- Composite Design Pattern: Simplifies client interaction with complex hierarchical structures by allowing uniform treatment of individual objects and compositions.
- Scalability: Additional employees or departments can be added without modifying existing code.
- Reusability: Code is reusable and maintains modularity, making the system adaptable to future changes in the organization structure.

  
## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see the Composite Pattern in action, simulating departments with nested employee structures.
