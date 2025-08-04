import React from 'react'

export const Conditional = ({keyword}) => {
  return (
    <div>{keyword == 'key' ? <p>You discovered keyword!</p> : <p>Wrong key word</p>}</div>
  )
}
