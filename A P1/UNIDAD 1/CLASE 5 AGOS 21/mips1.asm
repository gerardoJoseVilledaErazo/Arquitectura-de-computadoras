	.data
var1:	.word	5
var2:	.word	4
var3:	.word	0
	.text
main:	lw $2, var1
	lw $3, var2
	add $4, $2, $3
	sw $4, var3
	