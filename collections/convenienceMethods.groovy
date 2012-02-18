lst = ['Programming', 'In', 'Groovy']
count = 0 
lst.each { count += it.size() }
println count

//other ways to do the same
println lst.collect {  it.size() }.sum()

    // inject( ) calls the closure for each element of the collection
println lst.inject(0) { carryOver, element -> carryOver + element.size() }


//join list
println lst.join(' ')

//change element[0] in other list into list
lst[0] = ['Be', 'Productive']
println lst

//and flatten
lst = lst.flatten() 
println lst

//discard this elements to print 
println lst - ['Productive', 'In']

//size
println lst.size()
println lst*.size()//print size each elements

//method println
def words(a, b, c, d) {	
	println "$a $b $c $d"
}
words(*lst)//print each element