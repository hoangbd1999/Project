var KichThuoc = document.getElementsByClassName("slide")[0].clientWidth; //1anh:1000
var ChuyenSlide = document.getElementsByClassName("chuyen-slide")[0];
var Img = ChuyenSlide.getElementsByTagName("img"); //số phần tử ảnh trong mảng
var Max = KichThuoc * Img.length; // kích thước tối đa Chuyển có thể tới. (kthuoc*3600.số ảnh)
Max -= KichThuoc; //loại đi ảnh đầu tiên =0
var Chuyen = 0;
function Next() {
    if (Chuyen < Max)
        Chuyen += KichThuoc;
    else
        Chuyen = 0;
    // alert(Chuyen);
    ChuyenSlide.style.marginLeft = '-' + Chuyen + 'px';
}
function Back() {
    if (Chuyen == 0) // chuyen = 0 kéo về ảnh cuối cùng max
        Chuyen = Max;
    else
        Chuyen -= KichThuoc;
    // alert(Chuyen);
    ChuyenSlide.style.marginLeft = '-' + Chuyen + 'px';
}
setInterval(function () {
    Next();
}, 3000);
//setTimeout(function(){
//    Next();
//},3000);

  