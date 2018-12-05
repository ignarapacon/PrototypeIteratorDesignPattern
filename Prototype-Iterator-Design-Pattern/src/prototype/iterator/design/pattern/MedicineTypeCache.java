package prototype.iterator.design.pattern;

import java.util.Hashtable;

public class MedicineTypeCache {
	
   private static Hashtable<String, MedicineType> MedicineTypeMap  = new Hashtable<String, MedicineType>();

   public static MedicineType getMedicineType(String MedicineTypeId) {
      MedicineType cachedMedicineType = MedicineTypeMap.get(MedicineTypeId);
      return (MedicineType) cachedMedicineType.clone();
   }
   
   public static void loadCache() {
      Liquid liquid = new Liquid();
      liquid.setId("1");
      MedicineTypeMap.put(liquid.getId(),liquid);

      Tablet tablet = new Tablet();
      tablet.setId("2");
      MedicineTypeMap.put(tablet.getId(),tablet);

      Capsule capsule = new Capsule();
      capsule.setId("3");
      MedicineTypeMap.put(capsule.getId(), capsule);
   }
}

