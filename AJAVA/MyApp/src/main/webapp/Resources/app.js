
function validation()
{
	if(document.regForm.txtFirstName.value==" ")
	{
		alert("FirstName shouldn't be empty");
		return false;
	}
	
	if((document.regForm.gender[0].checked==false) && (document.regForm.gender[1].checked==false))
	{
		alert("select your gender");
		return false;
	}
	
	if(document.regForm.age.selectedIndex==0)
	{
		alert("select your age group");
		return false;
	}
	
	if(document.regForm.terms.checked==false)
	{
		alert("Agree terms and conditions !!");
		return false;
	}
}