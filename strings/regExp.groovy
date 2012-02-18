/*
-To create a pattern from a string, use the ~ operator. 
-To define a RegEx, use forward slashes as in /[G|g]roovy/. 
-To determine whether there’s a match, use =~.
-For an exact match, use ==~.
*/
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

str = 'Groovy is groovy, really groovy'
println str 
result = (str =~ /groovy/).replaceAll('hip')
println result