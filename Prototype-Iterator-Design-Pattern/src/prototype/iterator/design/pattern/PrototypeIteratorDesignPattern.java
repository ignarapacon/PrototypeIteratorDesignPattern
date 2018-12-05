
package prototype.iterator.design.pattern;

public class PrototypeIteratorDesignPattern {

    public static void main(String[] args) {
      MedicineTypeCache.loadCache();

      MedicineType clonedMedicineType = (MedicineType) MedicineTypeCache.getMedicineType("1");
      System.out.println("Type : " + clonedMedicineType.getType());	
      
      DrugRepositoryLiquid LiquidRepository = new DrugRepositoryLiquid();
      
      for(Iterator Liquid = LiquidRepository.getIterator(); Liquid.hasNext();){
         String Liquidmedicine = (String)Liquid.next();
         System.out.println("Drug Name : " + Liquidmedicine);
      } 

      MedicineType clonedMedicineType2 = (MedicineType) MedicineTypeCache.getMedicineType("2");
      System.out.println("Type : " + clonedMedicineType2.getType());
      
      DrugRepositoryTablet TabletRepository = new DrugRepositoryTablet();
      
      for(Iterator Tablet = TabletRepository.getIterator(); Tablet.hasNext();){
         String Tabletmedicine = (String)Tablet.next();
         System.out.println("Drug Name : " + Tabletmedicine);
      } 

      MedicineType clonedMedicineType3 = (MedicineType) MedicineTypeCache.getMedicineType("3");
      System.out.println("Type : " + clonedMedicineType3.getType());
      
       DrugRepositoryCapsule CapsuleRepository = new DrugRepositoryCapsule();
      
      for(Iterator Capsule = CapsuleRepository.getIterator(); Capsule.hasNext();){
         String Capsulemedicine = (String)Capsule.next();
         System.out.println("Drug Name : " + Capsulemedicine);
      } 
    }
    
}
