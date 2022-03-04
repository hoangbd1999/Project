function xlDangky()
{
    
    var username = document.getElementById("dnhap");
    var pass = document.getElementById("mkhau");
    var repass = document.getElementById("remkhau");
    var name = document.getElementById("hoten");
    var sex = document.getElementById("gtinh");
    var date = document.getElementById("datepicker");
    var job = document.getElementById("nnghiep");
    var email = document.getElementById("email");
    var phone = document.getElementById("dthoai");
    var aCong = email.value.indexOf('@');
    
    var aCong = email.value.indexOf('@');
   
 if (pass.value !== repass.value) {
        window.alert("mật khẩu không trùng nhau");
    } else if (username.value === "" || pass.value === "" || repass.value === "" || name.value === "" || email.value === "" || phone.value === "" || date.value === "") {
        window.alert("không được để trống");
    }else if(aCong<1) {
        window.alert("Sai định dạng Email");
    }
    else window.alert("Đăng kí thành công");
//      if(id == 'mkhau'){
//      if(value.length <6){window.alert("Password phải từ 6 ký tự");}
//      var pass =value;
     }







