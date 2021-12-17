package br.com.elo7;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	static Map<String, String> vulnerabilidades = new HashMap<>();
	
	static {
		vulnerabilidades.put("DDoS", "Distributed Denial of Service");
	}
	
	static Map<String, String> getVulnerabilidades(){
		return vulnerabilidades;
	}
	
	static boolean addVulnerabilidade(String initials, String name) {
		if(!vulnerabilidades.containsKey(initials)) {
			vulnerabilidades.put(initials, name);
			return true;
		}
		
		return false;
	}
	
	static boolean deleteVulnerabilidade(String initials) {
		if(vulnerabilidades.containsKey(initials)) {
			vulnerabilidades.remove(initials);
			return true;
		}
		
		return false;
	}
	
	static boolean updateVulnerabilidade(String oldInitials, String newName, String newInitials) {
		if(vulnerabilidades.containsKey(oldInitials)) {
			vulnerabilidades.remove(oldInitials);
			vulnerabilidades.put(newInitials, newName);
			return true;
		}
		
		return false;
	}
	
	
	
}
