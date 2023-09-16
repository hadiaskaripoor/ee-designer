import React from 'react';
import BarChart from 'react-easy-bar-chart';


const data = [
  {
    title: "Maths",
    value: 10,
    color: "#196f3d",
  },
  {
    title: "English",
    value: 14,
    color: "#a93226",
  },
  {
    title: "Physics",
    value: 2,
    color: " #1f618d",
  },
  {
    title: "Chemistry",
    value: 20,
    color: "#839192",
  },
  {
    title: "Psychology",
    value: 15,
    color: "#d35400",
  },
  {
    title: "Biology",
    value: 12,
    color: " #a9cce3",
  },
  {
    title: "Economics",
    value: 5,
    color: "#2e4053",
  },
  {
    title: "Social Science",
    value: 6,
    color: "#186a3b",
  },
];


export default function BarChartSchedule() {
  
  return (
    <div>
      <BarChart
        xAxis='React Bar Chart'
        yAxis="Values"
        height={400}
        width={800}
        data={data}
      />
    </div>
  )
}
