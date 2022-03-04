function importAnh(){
    var s = "<table>";
        socot = 1;
        sohang = (tenFileAnh2.length % socot == 0 ? 0 : 1) + tenFileAnh2.length / socot;
        for (var i = 0; i < sohang; i++) {
            s += "<tr>";
            for (var j = 0; j < socot; j++) {
                s += "<td>" + "<div class='zoom' id='ttgiaovien'><img id='gioithieugiaovien' src = 'C:\\Users\\GL552VW\\Desktop\\HTML\\project1\\Trangchu\\src\\" + tenFileAnh2[i*socot+j] + "'/>"
                        + "</div>"                        
                    + "</td>";
            s += "<td>" + "<p>"+ noidung2[i*socot+j] +"</p>" +"</td>";
            }
            s +=  "</tr>";
        }
        s += "</table>";
        document.getElementById("ttgiaovien").innerHTML = s;
        
    }
    tenFileAnh2 = [
        "1.jpg",
        "2.jpg",
        "8.jpg",
        "4.jpg",
        
//        "5.jpg",
//        "6.jpg"
        ];
    noidung2 = ["<b>One Piece Film: Z </b></br>Là movie One Piece thứ 12, Bộ phim được đạo diễn bởi Tatsuya Nagamine và được giám sát bởi Eiichiro Oda.</br></br><span id='thongtingv'>Trong trận Marineford (Tổng Bộ Hải Quân), Luffy đau khổ khi mất đi người anh trai của mình – Ace và cậu nhận ra rằng mình vẫn còn những người đồng đội (nakama). Để vượt qua nỗi buồn và quyết tâm mạnh hơn nữa để bảo vệ đồng đội mình, cậu đã nhờ Rayleigh chỉ bảo và dạy cậu cách để mạnh hơn. Quá trình tập luyện của Luffy kéo dài 2 năm tại đảo Rusukaina.Luffy sẽ được luyện tập cùng Rayleigh cũng như cách sử dụng Haki trong tập đặc biệt này.</span>",
        "<b>One Piece Film: Z </b></br>Là movie One Piece thứ 12, Bộ phim được đạo diễn bởi Tatsuya Nagamine và được giám sát bởi Eiichiro Oda.</br></br><span id='thongtingv'>Tập đặc biệt giới thiệu cho One Piece Film Gold chiếu rạp vào ngày 23/07/2016 ở Nhật, Tesoro đang truy tìm một kho báu bí ẩn tên là Vàng Nguyên Chất. Băng Mũ Rơm vô tình gặp được một cô gái biết vị trí cất giấu kho báu bí ẩn đó, nên họ quyết định tiến thẳng đến nơi cất giấu kho báu bí ẩn - hòn đảo huyền thoại Arukemi.</span>",
        "<b>One Piece Film: Z </b></br>One Piece Film Gold là bộ phim điện ảnh thứ 13 của thương hiệu One Piece</br></br><span id='thongtingv'>Trong bộ phim lần này, băng hải tặc Mũ Rơm sẽ phải đối đầu với Guild Tesoro, kẻ sở hữu trái ác quỷ Gold - Gold và là chủ nhân của Gran Tesoro - Thành phố giải trí nổi bằng vàng lớn nhất thế giới. Gran Tesoro là một thành phố độc lập, quy tụ hàng trăm tay chơi và hải tặc trên khắp thế giới; một nơi mà đến chính phủ cũng không thể kiểm soát. Guild Tesoro thống trị tất cả mọi thứ, thậm chí là hải tặc hay chính phủ bằng Vàng và tham vọng của hắn ngày càng lớn dần. Cán cân quyền lực của Tân thế giới bắt đầu thay đổi từ đây…</span>",
        "<b>One Piece Film: Z </b></br>Là movie One Piece thứ 12, Bộ phim được đạo diễn bởi Tatsuya Nagamine và được giám sát bởi Eiichiro Oda.</br></br><span id='thongtingv'>Anime One Piece sẽ có 1 tập TV Special đặc biệt dài khoảng 90 - 120 phút mang tên Episode of Sky Island chiếu vào hôm 25/08/2018. Đây sẽ là tập đặc biệt được làm lại phần ở Đảo Trên Trời. Đặc biệt, sẽ có 1 nhân vật được xuất hiện mà trong manga ở phần Skypiea không hề xuất hiện.Trên Asuka Island, băng Mũ Rơm được biết về một thanh kiếm huyền thoại và đó còn là thanh kiếm đắt nhất trên thế giới, nhưng thanh kiếm này cũng mang theo lời nguyền chết người. Khi trở về thuyền, họ phát hiện Zoro – người được giao nhiệm vụ canh thuyền đã biến mất... Hai sự kiện trùng hợp này có liên quan đến nhau hay không? Điều gì đang chờ đợi họ ở phía trước?</span>",
        "<b>One Piece Film: Z </b></br>Là movie One Piece thứ 12, Bộ phim được đạo diễn bởi Tatsuya Nagamine và được giám sát bởi Eiichiro Oda.</br></br><span id='thongtingv'>Câu chuyện nói về một ngày của nhóm Mũ Rơm. Khi thức dậy, vị thuyền trưởng phát hiện chiếc mũ yêu quý của mình đã đi đâu mất và cuống cuồng đi tìm khắp nơi. Và thế là tất cả thuyền viên trên Sunny Going bắt đầu lao vào tìm kiếm. Trong quá trình tìm kiếm, nhóm phải chống lại từ hải quân đến quái vật biển và cuối cùng là đến ngay một căn cứ hải quân. Cuộc chiến hải tặc - hải quân lại bắt đầu và một câu chuyện cảm động giữa 2 thuyền viên không bình thường trên một con tàu hải tặc vừa giải tán.</span> ",
        "<b>One Piece Film: Z </b></br>Là movie One Piece thứ 12, Bộ phim được đạo diễn bởi Tatsuya Nagamine và được giám sát bởi Eiichiro Oda.</br></br><span id='thongtingv'>Trên Asuka Island, băng Mũ Rơm được biết về một thanh kiếm huyền thoại và đó còn là thanh kiếm đắt nhất trên thế giới, nhưng thanh kiếm này cũng mang theo lời nguyền chết người. Khi trở về thuyền, họ phát hiện Zoro – người được giao nhiệm vụ canh thuyền đã biến mất... Hai sự kiện trùng hợp này có liên quan đến nhau hay không? Điều gì đang chờ đợi họ ở phía trước?</span>"
        
    ];










