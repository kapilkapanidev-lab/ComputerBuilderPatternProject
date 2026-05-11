# ComputerBuilderPattern

A Java project demonstrating the **Builder Design Pattern**. This pattern is used to construct a complex object (`Computer`) step by step, allowing for different configurations of the object without the need for multiple constructors.

## Key Features

- **Fluent API**: Uses method chaining for a clean and readable object construction.
- **Optional Parameters**: Easily handle optional fields like `GPU` with default values.
- **Immutability**: The `Computer` object is constructed via a private constructor, ensuring it remains consistent once built.

## Project Structure

- `src/Computer.java`: The core class containing the `Builder` inner class.
- `src/Main.java`: Contains the main method to demonstrate building different computer configurations.

## Usage Example

```java
Computer gamingPC = Computer.getBuilder()
    .cpu("Intel i9")
    .ram("32GB")
    .storage("1TB NVMe")
    .gpu("RTX 4080")
    .os("Windows 11")
    .build();

System.out.println(gamingPC);
```

## How to Run

1. Open the project in your favorite Java IDE.
2. Compile and run `Main.java`.
