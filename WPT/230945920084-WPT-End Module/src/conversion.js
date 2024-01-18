<<<<<<< HEAD
import React, { useState } from 'react';

export function WeightConverter()
{

const UnitConverter = () => {
 const [value, setValue] = useState('');
 const [unit, setUnit] = useState('kg');
 const [result, setResult] = useState('');

 const convertValue = () => {
    if (unit === 'kg') {
      setResult(value * 1000);
    } else {
      setResult(value / 1000);
    }
 };

 return (
    <div>
      <input type="number" value={value} onChange={(e) => setValue(e.target.value)} />
      <select value={unit} onChange={(e) => setUnit(e.target.value)}>
        <option value="kg">Kg</option>
        <option value="grams">Grams</option>
      </select>
      <button onClick={convertValue}>Convert</button>
      <p>{result}</p>
    </div>
 );
};

}

=======
import React, { useState } from 'react';

export function WeightConverter()
{

const UnitConverter = () => {
 const [value, setValue] = useState('');
 const [unit, setUnit] = useState('kg');
 const [result, setResult] = useState('');

 const convertValue = () => {
    if (unit === 'kg') {
      setResult(value * 1000);
    } else {
      setResult(value / 1000);
    }
 };

 return (
    <div>
      <input type="number" value={value} onChange={(e) => setValue(e.target.value)} />
      <select value={unit} onChange={(e) => setUnit(e.target.value)}>
        <option value="kg">Kg</option>
        <option value="grams">Grams</option>
      </select>
      <button onClick={convertValue}>Convert</button>
      <p>{result}</p>
    </div>
 );
};

}

>>>>>>> cb3c9955c3d6777556c92f0f5baf95c3bc3a93bc
export default WeightConverter;