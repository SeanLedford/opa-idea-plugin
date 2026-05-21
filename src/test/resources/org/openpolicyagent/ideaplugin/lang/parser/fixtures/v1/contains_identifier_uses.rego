package play

# Compound identifiers — "contains" as substring stays an ASCII_LETTER
result := net.cidr_contains(cidr, cidr_or_ip)
output := net.cidr_contains_matches(cidrs, cidrs_or_ips)
mixed := my_contains_var

# function call
basic := contains(haystack, needle)

# contains inside a string
msg := "my bag contains snacks"

# All forms together inside a rule body
combo if {
	result := contains(haystack, needle)
	net.cidr_contains(cidr, ip)
	msg := "this string contains the word contains"
}

admins contains user if {
	user := "alice"
}
