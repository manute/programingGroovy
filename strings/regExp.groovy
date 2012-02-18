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
 