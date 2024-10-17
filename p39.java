package part8;
import java.util.Arrays;

public class p39 {

	    public static <T extends Comparable<T>> void sort(T[] array)
	    {
	            // Simple insertion sort algorithm
	            for (int i = 1; i < array.length; i++)
	            {
	                T key = array[i];
	                int j = i - 1;

	                // Move elements that are greater than key, to one position ahead
	                while (j >= 0 && array[j].compareTo(key) > 0)
	                {
	                    array[j + 1] = array[j];
	                    j = j - 1;
	                }
	                array[j + 1] = key;
	            }
	    }

	    public static void main(String[] args)
	    {
	            // Example: Sorting products by natural ordering (e.g., price or rating)
	        Product[] products =
	                {
	                    new Product("Laptop", 10000.0),
	                    new Product("Phone", 8000.0),
	                    new Product("Tablet", 6000.0)
	                };

	        System.out.println("Before sorting:");
	        System.out.println(Arrays.toString(products));

	            // Sort the products
	        sort(products);

	        System.out.println("After sorting:");
	        System.out.println(Arrays.toString(products));
	    }
	}
	    // Example Product class implementing Comparable
	class Product implements Comparable<Product>
	    {
	        private String name;
	        private double price;

	        public Product(String name, double price) {
	            this.name = name;
	            this.price = price;
	        }

	        public String getName() {
	            return name;
	        }

	        public double getPrice() {
	            return price;
	        }
	        @Override
	        public int compareTo(Product other)
	        {
	            // Compare by price (natural ordering)
	            return Double.compare(this.price, other.price);
	        }

	        @Override
	        public String toString() {
	            return name + ": $" + price;
	        }
	}

