function createChart(selector, data) {
    var ctx = jQuery(selector).get(0).getContext("2d");
    new Chart(ctx).Doughnut(data);
}

function displayChart(urldata, selector) {
    jQuery.get(urldata, function(data) {
        var invoice_status_data = [
                {
                    value: data.status_temp,
                    color: "#26292C",
                    highlight: "#363B3F",
                    label: "Temp"
                },
                {
                    value: data.status_pending,
                    color: "#FFA500",
                    highlight: "#FAD694",
                    label: "Pending"
                },
                {
                    value: data.status_partial,
                    color: "#E14D43",
                    highlight: "#FF5A5E",
                    label: "Partial"
                },
                {
                    value: data.status_complete,
                    color: "#76AB48",
                    highlight: "#86BC4A",
                    label: "Complete"
                }
            ];
            createChart(selector, invoice_status_data);
        }
    )
}

function displayChart1(urldata, selector) {
    jQuery.get(urldata, function(data) {
            createChart(selector, data);
        }
    )
}
