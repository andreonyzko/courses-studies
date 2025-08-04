import React from 'react'

export const List = ({list}) => {
  return (
    <ul>
        {list.map((item, index) => (
            <li key={index}>{item}</li>
        ))}
    </ul>
  )
}
