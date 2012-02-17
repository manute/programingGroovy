def iterate(n,closure){
	1.upto(n){
		println "In iterate with ${it}"
		closure(it)
	}
	
}
total=0
println "Calling closure"
iterate(4) {
	total += it
	println	"Total "+ total
}