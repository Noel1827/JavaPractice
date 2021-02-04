public class AnimalList {
        private Animal[] thelist = new Animal[5];
        private int i = 0;
    
        public void add(Animal d) {
            if (i < thelist.length) {
                thelist[i]=d;
                System.out.println("Dog added at index "+i);
                i++;
            }
        }
    
    
}
