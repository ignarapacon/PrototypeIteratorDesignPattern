
package prototype.iterator.design.pattern;

public class DrugRepositoryCapsule implements Container {
   public String drug[] = {"Alfacalcidol", "Ampicillin", "Cephalexin", 
       "Celecoxib", "Doxycycline\n",};

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
