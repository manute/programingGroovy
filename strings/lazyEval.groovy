/*
price = 568.23 
company = 'Google'
quote = "Today $company stock closed at $price" 
println quote
*/
/*
companyClosure = { -> company }//it.write(company) } 
priceClosure = { ->price } //it.write("$price") } 
quote = "Today ${->companyClosure} stock closed at ${priceClosure}"
*/
quote = "Today ${->company} stock closed at ${->price}"

stocks=[Apple:423.45,Microsoft:222]

stocks.each { key,value ->
	
	company = key 
	price = value 
	println quote
	
}