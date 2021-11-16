public class Book_details {

        String name;
        double price;
        int stock;

        public Book_details(String name, double price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }


        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

    public String toString() {
        return (name+" "+price+" "+stock);
    }
}


    class Author {
        String aname;
        char gender;

        public Author(String aname, char gender) {
            this.aname = aname;
            this.gender = gender;
        }


        public char getGender() {
            return gender;
        }

        public String getAname() {
            return aname;
        }


        public void setGender(char gender) {
            this.gender = gender;
        }

        public void setAname(String aname) {
            this.aname = aname;
        }


        public String toString() {
            return (aname + " " + gender);

        }
    }
    class display{

        public static void main(String[] args) {
            Book_details obj1 = new Book_details("aaa", 100, 3);
            Author obj2 = new Author("bbb", 'M');
            System.out.println(obj1);
            System.out.println(obj2);
        }

    }
