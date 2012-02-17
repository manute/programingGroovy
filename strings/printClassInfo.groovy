def printClassInfo(obj){
	
	println "class:  ${obj.getClass().name} "
	println "superclass:  ${obj.getClass().superclass.name} "
		
}

val = 125 
printClassInfo ("The Stock closed at ${val}") 
printClassInfo (/The Stock closed at ${val}/) 
printClassInfo ("This is a simple String")