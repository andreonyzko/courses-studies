import React from "react";
import "./button.css";

export const Button = () => {
  const buttonStyle = {
    backgroundColor: "rgb(0, 143, 220)",
    margin: "10px",
  };

  return (
    <>
      {/* Inline */}
      <button style={{ backgroundColor: "rgb(0, 143, 220)", margin: "10px" }}>Blue button</button>

      {/* Object */}
      <button style={buttonStyle}>Blue button</button>

      {/* External */}
      <button className="blue-button">Blue button</button>
    </>
  );
};
