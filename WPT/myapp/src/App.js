import logo from './logo.svg';
import './App.css';
import FuncComp from './component/FuncComp';
import ClassComp from './component/ClassComp';
import MyStateComp from './component/MyStateComp';
import MyDetailComp from './Tasks/MyDetailComp';
import FriendDetailComp from './Tasks/FriendDetailComp';
import CounterComp from './Tasks/CounterComp';
import ClockComp from './Tasks/ClockComp';
import ParentComp from './component/ParentComp';
import MyImagesComp from './component/MyimagesComp';
import ChangeImages from './Tasks/ChangeImages';
import ToggleImg from './Tasks/ToggleImg';
import ImgSlider from './Tasks/imgSlider';


function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}

      <h1>Buri buri zaymon..!</h1>
       {/* <FuncComp myname = "Shruti" post = "Software Engineer"></FuncComp>

      <ClassComp myname = "Shruti" post = "Software Engineer"></ClassComp>

      <MyStateComp/>

      <MyDetailComp fname = "Shruti" lname = "Avhad" gender = "Female" city = "Sinnar" country = "India"></MyDetailComp>

      <FriendDetailComp fname = "Vg" lname = "Gosavi" gender = "Female" city = "Sinnar" country = "India"></FriendDetailComp>

      <CounterComp/>

      <ClockComp/> 

      <ParentComp/> 

      <MyImagesComp/>

      <ChangeImages/>  

      <ToggleImg/> */}

      <ImgSlider/>
    
    </div>
  );
}

export default App;
