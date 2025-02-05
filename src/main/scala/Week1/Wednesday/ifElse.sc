
val weather: String = "Hot"

if (weather == "Hot") {
  s"It is $weather, no coat needed."
} else if (weather=="raining") {
  s"Wear a coat mate, it is $weather."}
else {s"$weather is not valid"}

val season: String = "Winter"
if (weather.toLowerCase == "cold" || season.toLowerCase == "winter") {s"It is $weather, take a coat"} else {"A light jacket is fine"}



val num = 10
val result = if (num > 5) "Big" else "Small" // Ternary-like
println(result) // "Big"

//Task 1

val studentGrade: Int = 102

val grade = if (studentGrade < 0 || studentGrade > 100) "Invalid score"
else if (studentGrade >= 90) "A"
else if (studentGrade >= 80) "B"
else if (studentGrade >= 70) "C"
else if (studentGrade >= 60) "D"
else if (studentGrade >= 50) "E"
else "F"

println(grade)

//Task 2

val age: Int = 1

val rating = if (age <= 0 || age > 110) "Invalid age"
else if (age >= 18) "18"
else if (age >= 15) "15"
else if (age >= 12) "12"
else if (age >= 8) "PG"
else if (age >= 4) "U"
else "You are a baby!"

println(rating)

