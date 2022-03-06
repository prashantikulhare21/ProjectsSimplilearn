package VirtualkeyRepository;
import VirtualkeyRepository.menuOption;
import VirtualkeyRepository.HandleOption;
import VirtualkeyRepository.FileOperations;
public class LockedMeMain {
public static void main(String[] args) {
		
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		menuOption.printWelcomeScreen("Locker", "Prashanti");
		
		HandleOption.handleWelcomeScreenInput();
	}

}



