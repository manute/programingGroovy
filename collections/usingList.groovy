lst=[1,2,3,4,5,6]
println lst
println lst.getClass().name

// first and last elements
println lst[0]
println lst[lst.size()-1]

//last 2 elements (easy with '-' )
println lst[-1]//last element
println lst[-2]

//range 
println lst[0..-1]
println lst[5..2]

//error -> if you change an element using one list, you’re affecting the other.
subLst = lst[2..5] 
println subLst.dump()

//method collect -> operate  on each element in the collection and return a resulting collection
println lst.collect { it * 2 }

//methods find element
println lst.find { it == 2 }
println lst.find { it > 4 }
println lst.findAll { it == 2 }
println lst.findAll { it > 4 }