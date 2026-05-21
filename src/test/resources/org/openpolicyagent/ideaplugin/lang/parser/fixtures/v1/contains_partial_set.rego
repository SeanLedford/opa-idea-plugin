package play

active_users contains user if {
	user := "alice"
	input.active == true
}

allowed_actions contains action if {
	action := "read"
}
