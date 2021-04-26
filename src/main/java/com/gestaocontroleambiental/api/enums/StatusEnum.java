package com.gestaocontroleambiental.api.enums;

public enum StatusEnum {
	New,
	Assigned,
	Resolved,
	Approved,
	Disaproved,
	Classed;
	
	public static StatusEnum getStatus(String status){
		switch (status) {
			case "New": return New;
			case "Assigned": return Assigned;
			case "Resolved": return Resolved;
			case "Disaproved": return Approved;
			case "Approved": return Approved;
			case "Classed": return Classed;
			default: return New;
		}
	}
}
