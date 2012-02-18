
reg = ~"hello"

println reg.getClass().name

pattern = ~"(G|g)roovy"
text="Groovy is hip"

if(text =~ pattern)
  println 'matches'
else
  println 'no matches'

if(text ==~ pattern)
  println 'matches'
else
  println 'no matches'

matcher = 'Groovy is groovy' =~ /(G|g)roovy/
print "Size of matcher is ${matcher.size()} with elements :" 
println ""
matcher.each {
	println "${it}"
}
