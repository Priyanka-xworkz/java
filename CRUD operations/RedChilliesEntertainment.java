import java.util.Arrays;
class RedChilliesEntertainment{
	static String movieActors[] = {null,null, null, null, null, null, null, null, null};
	static int index;
	
	public static boolean addMovieActors(String movieActor){
	boolean isMovieActorAdded = false;
	if(movieActor != null){
		movieActors[index] = movieActor;
		index++;
		return isMovieActorAdded=true;
	}else
		System.out.println("Please add the Actors name..");
	
	return isMovieActorAdded;
	
	
	}
	public static void getMovieActors(){
		for(String movieActor : movieActors){
		System.out.println("The movie Actor name is : " +movieActor);
	}
	}
	public static boolean updateMovieActors(String oldActors, String newActors){
		boolean isMovieActorUpdated = false;
		for(int index= 0 ; index < movieActors.length; index++){
			if(oldActors == movieActors[index]){
				movieActors[index ] = newActors;
				isMovieActorUpdated = true;
			}
			
		}
		if(isMovieActorUpdated == false){
			System.out.println(oldActors + "not found");
		}
		return isMovieActorUpdated ;
	}
	
	public static boolean deleteMovieActors(String movieActorToBeDeleted){
		System.out.println("movieActorToBeDeleted start");
		boolean isMovieActorDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0 , oldIndex=0; oldIndex < movieActors.length ; oldIndex++){
			if(movieActors[oldIndex] != movieActorToBeDeleted){
					movieActors[newIndex] = movieActors[oldIndex];
					newIndex++;
				}
			}
			movieActors = Arrays.copyOf(movieActors, newIndex);
		 if(movieActors != null){
			 isMovieActorDeleted = true;
		 }
		 if(isMovieActorDeleted == false){
			 System.out.println(movieActorToBeDeleted + "not found");
		 }
		 
		 		 
		System.out.println("movieActorToBeDeleted end");
		 return isMovieActorDeleted;
	}



}