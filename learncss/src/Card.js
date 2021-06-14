import React from 'react';
import { createUseStyles } from 'react-jss'
import ReactLogo from './template/sedans.svg';

const useStyles = createUseStyles({
  cardContainer: {
    display: 'flex',
    flexDirection: 'column',
    justifyContent:'start',
    width: '33.33%',
    transition:'500ms ease',
    height: 500,
    opacity:0.5,
    // borderRadius: props => props.radius,
    backgroundColor: props => props.color,
    color: 'white',
    '& > *':{
      marginLeft:30
    },
    '&:hover':{
      transform:'scale(1.05)',
      opacity:1
      }
  },
  learnButton:{
    backgroundColor:'white',
    width:'50%',
    cursor:'pointer',
    boxSizing:'border-box',
    paddingLeft:'2rem',
    paddingTop:'0.5rem',
    height:'2rem',
    borderRadius:30,
    color:props => props.color,
  },
  '@media (max-width:600px)': {
    cardContainer: {
      width: '60%',
      height:'370px'
    }
  },
  icon: {
    marginTop:30,
    width: '20%',
    height: '15%'
  }
})

const Card = (props) => {
 
  const classes = useStyles(props)
  // const classes = {}
  return (
    <>
      <div className={classes.cardContainer}>
        <img className={classes.icon} alt={'stam'} src={ReactLogo} />
        <h1> {'SEDANS'}</h1>
        <p style={{height:'40%'}}> Lorem ipsum dolor sit amet consectetur adipisicing elit. Debitis ducimus aperiam blanditiis eos laudantium. Fuga voluptatem quam doloremque illo iusto laborum. Eligendi dolorem ex error rerum quasi neque corrupti sint!</p>
        <div className={classes.learnButton}>{'Learn More'}</div>
      </div>

    </>
  );
}

export default Card;