<script>
                           
            function myFun() {
                document.getElementById("report").innerHTML = "";
                flag = true;
                n = document.getElementById("inputN").value;
                var s = "<table>";
                for (var i = 0; i < n; i++) {
                    s = s + "<tr>";
                    for (var j = 0; j < n; j++) {
//                        if ((i + j) % 2 == 0)
                        s = s + "<td id = 'a" + (i * n + j) + "'onclick = 'xuly(" + i + "," + j + ")'></td>";

//                        else
//                            s = s + "<td class='red'></td>";
//                        s += "<td class = '" + ((i + j) % 2 ? "red" : "blue") + "'></td>";
                    }
                    s = s + "</tr>";
                }
                s = s + "</table>";
                document.getElementById("noideve").innerHTML = s;
                p = 0;
            }
            function xuly(x, y) {
                if (p == 1)
                    return 0;
                var vitri = document.getElementById("a" + (x * n + y));
                if (vitri.innerHTML == 0) {
                    vitri.innerHTML = flag ? "<span style='color:red'>X</span>" : "<span style='color:blue'>O</span>";
                    flag = !flag;
                }
                if (checkWin(x, y)) {
                    document.getElementById("report").innerHTML = flag ? "O win" : "X win";
                    p = 1;
                }
            }

          
            function checkWin(x, y) {
                var count = 0;
                var vitri = document.getElementById("a" + (x * n + y));
                var m = vitri.innerHTML;

                var ngang = 1, doc = 1, cheo1 = 1, cheo2 = 1;

                count = 0;
                for (var i = 1; i < 5; i++) {
                    if (x + i >= n)
                        break;
                    var k = document.getElementById("a" + ((x + i) * n + y)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                for (var i = 1; i < 5; i++) {
                    if (x - i < 0)
                        break;
                    var k = document.getElementById("a" + ((x - i) * n + y)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                if (count != 4)
                    doc = 0;

                count = 0;
                for (var i = 1; i < 5; i++) {
                    if (y + i >= n)
                        break;
                    var k = document.getElementById("a" + (x * n + y + i)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                for (var i = 1; i < 5; i++) {
                    if (y - i < 0)
                        break;
                    var k = document.getElementById("a" + (x * n + y - i)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                if (count != 4)
                    ngang = 0;

                count = 0;
                for (var i = 1; i < 5; i++) {
                    if (x + i >= n || y + i >= n)
                        break;
                    var k = document.getElementById("a" + ((x + i) * n + y + i)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                for (var i = 1; i < 5; i++) {
                    if (x - i < 0 || y - i < 0)
                        break;
                    var k = document.getElementById("a" + ((x - i) * n + y - i)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                if (count != 4)
                    cheo1 = 0;

                count = 0;
                for (var i = 1; i < 5; i++) {
                    if (x + i >= n || y - i < 0)
                        break;
                    var k = document.getElementById("a" + ((x + i) * n + y - i)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                for (var i = 1; i < 5; i++) {
                    if (x - i < 0 || y + i >= n)
                        break;
                    var k = document.getElementById("a" + ((x - i) * n + y + i)).innerHTML;
                    if (k === m)
                        count++;
                    else
                        break;
                }
                if (count != 4)
                    cheo2 = 0;

                if (ngang || doc || cheo1 || cheo2)
                    return true;
                else
                    return false;
            }

        </script>

