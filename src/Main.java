//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Computer.Builder builder1 = Computer.getBuilder();
    Computer.Builder builder2 = Computer.getBuilder();

    List<Computer> computers = new ArrayList<>();
    computers.add(builder1.cpu("Intel i9").gpu("RTX 4090").ram("32 GB").storage("1 TB SSD").os("Windows 11").build());
    computers.add(builder2.cpu("AMD Ryzen 5").ram("16 GB").storage("512 GB").os("Ubuntu").build());

    computers.forEach(System.out::println);



}
