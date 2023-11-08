  import java.util.Scanner;

class Invoice {
    String invoiceId;
    double invoicePrice;
    String vendorName;
    String invoiceName;
    String location;

    // Default constructor
    public Invoice() {
        this.invoiceId = "";
        this.invoicePrice = 0.0;
        this.vendorName = "";
        this.invoiceName = "";
        this.location = "";
    }

    // Method to add an invoice (read from user)
    public void addInvoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Invoice ID: ");
        this.invoiceId = scanner.nextLine();

        System.out.print("Enter Invoice Price: ");
        this.invoicePrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Vendor Name: ");
        this.vendorName = scanner.nextLine();

        System.out.print("Enter Invoice Name: ");
        this.invoiceName = scanner.nextLine();

        System.out.print("Enter Location: ");
        this.location = scanner.nextLine();
    }

    // Method to display all data members
    public void displayInvoice() {
        System.out.println("Invoice ID: " + this.invoiceId);
        System.out.println("Invoice Price: " + this.invoicePrice);
        System.out.println("Vendor Name: " + this.vendorName);
        System.out.println("Invoice Name: " + this.invoiceName);
        System.out.println("Location: " + this.location);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of invoices (n): ");
        int n = Integer.parseInt(scanner.nextLine());

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            invoices[i] = new Invoice();
            invoices[i].addInvoice();
        }

        System.out.println("\nDisplaying Invoices:");
        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i+1) + ":");
            invoices[i].displayInvoice();
            System.out.println();
        }
    }
}