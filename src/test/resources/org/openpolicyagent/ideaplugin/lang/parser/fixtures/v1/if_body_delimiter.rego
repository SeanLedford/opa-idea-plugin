package play

allow if {
	input.user == "alice"
}

deny if {
	input.user == "mallory"
}
