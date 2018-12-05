
package prototype.iterator.design.pattern;

public class DrugRepositoryTablet implements Container {
   public String drug[] = {"Reasulf tablets","Hydroxypropyl cellulose",
       "Sandoz Effervescent tablet","Hydroxypropylmethylcellulose succinate",
       "Magnesium Trisilicate tablet\n"};

   @Override
   public Iterator getIterator() {
      return new DrugIterator();
   }
   private class DrugIterator implements Iterator {
      int index;
      @Override
      public boolean hasNext() {
         if(index < drug.length){
            return true;
         }
         return false;
      }
      @Override
      public Object next() {
      
         if(this.hasNext()){
            return drug[index++];
         }
         return null;
      }		
   }
}
