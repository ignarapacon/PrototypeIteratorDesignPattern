
package prototype.iterator.design.pattern;

public class DrugRepositoryLiquid implements Container {
   public String drug[] = {"Cimetidine Solution", "Isoniazid Syrup", 
       "Nortriptyline Solution", "Theophylline Solution", "Metoclopramide Syrup\n"};

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
