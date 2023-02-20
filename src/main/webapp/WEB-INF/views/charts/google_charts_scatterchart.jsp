<html>

<head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />
    <script type="text/javascript">
        google.charts.load('current', { 'packages': ['corechart'] });
        google.charts.setOnLoadCallback(drawChart);

        let dataArray = ${ dataArray };
        // let dataArray = $[dataArray];

        function drawChart() {

            // var data = google.visualization.arrayToDataTable([
            //     ['Age', 'Weight'],
            //     [8, 12],
            //     [4, 5.5],
            //     [11, 14],
            //     [4, 5],
            //     [3, 3.5],
            //     [6.5, 7]
            // ]);

            var data = google.visualization.arrayToDataTable(dataArray);
            let targetElement = document.getElementById('chart_div');
            let height = targetElement.parentElement.clientHeight;
            var options = {
                title: 'Age vs. Weight comparison',
                height: height,
                hAxis: { title: 'Age', minValue: 0, maxValue: 15 },
                vAxis: { title: 'Weight', minValue: 0, maxValue: 15 },
                legend: 'none'  // 범례
            };


            var chart = new google.visualization.ScatterChart(document.getElementById('chart_div'));
            // 여기서 ScatterChart라는 이름만 다른 차트로 바꾸면 차트가 변경된다

            chart.draw(data, options);
        }
        window.addEventListener("resize", drawChart, false);
    </script>

    <style>
        * {
            border: 0.1rem dotted gray;
        }

        .vh-50 {
            height: 50vh;
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="row vh-50">
            <!-- vh는 viewport, 디바이스에 따라 화면크기가 바뀐다. -->
            <div class="col-5" id="chart_div">
            </div>
            <div class="col-7">Aside left
            </div>
        </div>
    </div>
    <!-- <div id="chart_div" style="width: 500px; height: 300px;"></div> -->

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>

</html>