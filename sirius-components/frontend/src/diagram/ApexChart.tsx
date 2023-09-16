import Button from '@material-ui/core/Button';
import React from 'react';
import ReactApexChart from 'react-apexcharts';
import ScheduleService from './ScheduleService';


interface ChartProps {
    onHideSchedule: (() => void),
    onError: (() => void),
    docuId: string,
    projId: string,
    objId: string,
    kind: string,
    label: string,
}

class ApexChart extends React.Component<ChartProps, any> {
    constructor(props) {
        super(props);
        this.state = {
            options: {
                chart: {
                    height: '600',
                    type: 'rangeBar',
                    toolbar: {
                        show: true,
                        autoSelected: 'selection'
                    },
                },
                noData: {
                },
                plotOptions: {
                    bar: {
                        horizontal: true,

                    }
                },
                legend: {
                    position: 'right'
                },

                tooltip: {
                    custom: ({ dataPointIndex, w }) => {
                        let s = w.config.series[0].data[dataPointIndex];
                        return `<div class="apexcharts-tooltip-rangebar"><div>
                    <span class="category">${s.x}: </span>
                    <span class="value start-value">${s.y[0]}</span>
                    <span class="separator">-</span>
                    <span class="value end-value">${s.y[1]}</span></div></div>`;
                    }
                },
            },
            series: [
                {
                    data: []
                }
            ],
        }
    }

    componentDidUpdate(prevProps) {
        console.log("update");
        if (this.props.docuId != prevProps.docuId) {
            this.setData();
        }
    }

    componentDidMount() {
        this.setData();
    }

    setData() {
        ScheduleService.getObjects(this.props.docuId, this.props.projId,
            this.props.objId, this.props.kind,
            this.props.label).then((response) => {
                var hyperperiod = response.data[0].hyperperiod;
                //delete response.data[1];
                //delete the first element 
                response.data.splice(0, 1);
                console.log("hyperperiod: " + hyperperiod);
                this.setState({
                    ...this.state,
                    options:
                    {
                        ...this.state.options,

                        xaxis: {
                            type: 'numeric',
                            title: {
                                text: 'ms'
                            },
                            labels: {
                                show: true,
                                formatter: function (val) {
                                    return val.toFixed(2);
                                }
                            },
                            max: hyperperiod,

                            decimalInFloat: 3,
                        },

                    },

                    series: [
                        {
                            data: response.data
                        }
                    ],
                })
                if (!response.data || !response.data.length) {
                    console.log("empty")
                    this.props.onError();
                }
            });
    }



    render() {
        return (
            <div id="chart" data-testid="chart" style={{ height: "80%", width: "100%" }}>
                <ReactApexChart
                    options={this.state.options}
                    series={this.state.series} type="rangeBar" height={600}>
                </ReactApexChart>
                <Button
                    variant="contained"
                    data-testid="create-representation"
                    color="primary"
                    onClick={this.props.onHideSchedule}>
                    Back
                </Button>
            </div>
        );
    }
}
export default ApexChart