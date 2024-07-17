import java.util.Arrays;
class Gym{
	static String gymEquipments[] = {null, null, null, null, null, null, null, null};
	static int gymIndex;
	
	public static boolean createGymEquipment(String gymEquipment){
		boolean isEquipmentAdded = false;
		if(gymEquipment != null){
			gymEquipments[gymIndex] = gymEquipment;
			gymIndex++;
			isEquipmentAdded = true;
		}else
			System.out.println("Provide equipment name....");
			return isEquipmentAdded;
		
		
	}
	public static void getGymEquipments(){
		for(String gymEquipment : gymEquipments){
			System.out.println(gymEquipment);
		}
		
	}
	
	public static boolean updateGymEquipmets(String oldName, String newName){
		boolean isGymEquipmentUpdated = false;
		for(int index = 0 ; index < gymEquipments.length ; index++){
			if(oldName == gymEquipments[index]){
				gymEquipments[index ] = newName;
				isGymEquipmentUpdated = true;
			}
			}
			if(isGymEquipmentUpdated == false){
				System.out.println(oldName+ "not found");
			}
			return isGymEquipmentUpdated;
		}
		
		public static boolean deleteGymEquipments(String gymEquipmentsToBeDeleted){
			System.out.println("deleteGymEquipments start");
			boolean isGymEquipmentDeleted = false;
			int newIndex, oldIndex;
			for(newIndex = 0, oldIndex=0; oldIndex<gymEquipments.length; oldIndex++){
				if(gymEquipments[oldIndex] != gymEquipmentsToBeDeleted){
					gymEquipments[newIndex] = gymEquipments[oldIndex];
					newIndex++;
				}
			}
			gymEquipments = Arrays.copyOf(gymEquipments, newIndex);
		 if(gymEquipments != null){
			 isGymEquipmentDeleted = true;
		 }
		 if(isGymEquipmentDeleted == false){
			 System.out.println(gymEquipmentsToBeDeleted + "not found");
		 }
		 
		 		 
		System.out.println("deleteGymEquipments end");
		 return isGymEquipmentDeleted;
			
		}
		
		
		
	}



