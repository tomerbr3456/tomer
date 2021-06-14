import { createUseStyles } from 'react-jss'
import Card from './Card.js';
import React from 'react';


const useStyles = createUseStyles({
  cardsContainer: {
    display: 'flex',
    flexDirection: 'row',
    maxWidth:1000,
    marginTop:100,
    justifyContent:'center',
    '& + .cardContainer-0-2-2':{
      marginLeft:30,
      borderRadius:'15px 0 0 15px'
    }
  },
  "@global": {
    ".cardsContainer-0-2-1 + .cardContainer-0-2-2:": {
      "margin": "10px"
    }
  },
  '@media (max-width:600px)': {
    cardsContainer: {
      flexDirection: 'column',
      alignItems:'center'
    }
  }
})

const Cards = () => {
  const classes = useStyles()
  return (
    <>
      <div className={classes.cardsContainer}>
        <Card radius={'0.5rem 0 0 0.5rem'} color={'hsl(31, 77%, 52%)'} />
        <Card color={'hsl(184, 100%, 22%)'}/>
        <Card radius={'0 0.5rem 0.5rem 0'} color={'hsl(179, 100%, 13%)'} />
      </div>
    </>
  );
}

export default Cards;